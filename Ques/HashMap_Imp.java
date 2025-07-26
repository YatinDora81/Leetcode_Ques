// put , get , containsKey , remove , size , keySet
import java.util.*;

public class HashMap_Imp {

    public static class Node<K, V> {
        K key;
        V value;

        Node(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }

    public static class hashMop<K, V> {

        private LinkedList<Node<K, V>> buckets[];
        private int N = 4; // bucket size
        private int n; // no of nodes

        @SuppressWarnings("unchecked")
        hashMop() {
            buckets = new LinkedList[N];
            n = 0;
            for (int i = 0; i < N; i++)
                buckets[i] = new LinkedList<>();
        }

        public void put(K key, V value) {

            // 2 option update or new
            int bi = getBucketIndex(key);
            int ele = findKey_ParticularBucket(key);
            if (ele != -1) {
                buckets[bi].get(ele).value = value;
            } else {
                Node<K, V> node = new Node<K, V>(key, value);
                buckets[bi].add(node);
                n++;
                validateThreshold();
            }
        }

        public V get(K key) {
            int bi = getBucketIndex(key);
            int ele = findKey_ParticularBucket(key);
            if (ele != -1)
                return buckets[bi].get(ele).value;
            return null;
        }

        public List<K> keySet() {
            List<K> ans = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    ans.add(buckets[i].get(j).key);
                }
            }
            return ans;
        }

        public boolean containsKey(K key) {
            int bi = getBucketIndex(key);

            for (int i = 0; i < buckets[bi].size(); i++) {
                if (buckets[bi].get(i).key.equals(key))
                    return true;
            }
            return false;
        }

        public boolean remove(K key) {
            int bi = getBucketIndex(key);

            for (int i = 0; i < buckets[bi].size(); i++) {
                if (buckets[bi].get(i).key.equals(key)) {
                    buckets[bi].remove(i);
                    n--;
                }
            }
            return false;
        }

        @SuppressWarnings("unchecked")
        private void validateThreshold() {
            float lamda = 2;
            float threshhold = (float)n / (float)N;
            
            if(threshhold<lamda) return;
            this.N = N * 2;
            this.n = 0;
            LinkedList<Node<K, V>> oldBucket[] = deepCopyBucket(buckets);
            this.buckets = new LinkedList[N];
            for(int i=0;i<N;i++) buckets[i] = new LinkedList<>();
            
            for(int i=0;i<oldBucket.length;i++){
                for(int j=0;j<oldBucket[i].size();j++){
                    int bi = getBucketIndex(oldBucket[i].get(j).key);
                    this.buckets[bi].add(new Node<K,V>(oldBucket[i].get(j).key , oldBucket[i].get(j).value));
                    n++;
                }
            }
        }

        @SuppressWarnings("unchecked")
        private LinkedList<Node<K, V>>[] deepCopyBucket(LinkedList<Node<K, V>> bucket[]){

            LinkedList<Node<K, V>> newBu[] = new LinkedList[bucket.length];
            for(int i=0;i<bucket.length;i++){
                newBu[i] = new LinkedList<>(bucket[i]);
            }

            return newBu;
        }

        public int size() {
            return n;
        }

        private int findKey_ParticularBucket(K key) {
            int bi = getBucketIndex(key);

            for (int i = 0; i < buckets[bi].size(); i++) {
                if (buckets[bi].get(i).key.equals(key))
                    return i;
            }
            
            return -1;
        }

        private int getBucketIndex(K key) {
            return Math.abs(key.hashCode()) % N;
        }
    }

    public static void main(String args[]) {
        hashMop<Integer, String> map = new hashMop<Integer, String>();

        map.put(1, "okay");
        // map.put(2, "stfu");
        // map.put(2, "mkc");
        // map.put(4, "okay");
        // map.put(5, "stfu");
        // map.put(62, "mkc");
        // map.put(8, "okay");
        // map.put(882, "stfu");
        // map.put(28, "mkc");
        // map.put(71, "okay");
        // map.put(288, "stfu");
        // map.put(298, "mkc");


        //  map.put(34, "okay");
        // map.put(53, "stfu");
        // map.put(602, "mkc");
        // map.put(80, "okay");
        // map.put(8802, "stfu");
        // map.put(280, "mkc");
        // map.put(710, "okay");
        // map.put(2880, "stfu");
        // map.put(2980, "mkc");
        // map.remove(2);

        // System.out.println(map.get(1));
        // System.out.println(map.get(2));
        // // System.out.println(map.get(3));
        // // System.out.println(map.containsKey(2));
        // System.out.println(map.size());
    }
}