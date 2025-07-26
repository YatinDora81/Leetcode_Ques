import java.util.*;

public class HashSet_Imp {

    public static class hashSet<K> {
        LinkedList<K> buckets[];
        int N; // bucket size
        int n; // no of nodes

        @SuppressWarnings("unchecked")
        hashSet() {
            this.N = 4;
            n = 0;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++)
                buckets[i] = new LinkedList<>();
        }

        public K put(K key) {
            int bi = getBucketIndex(key);
            for (K k : buckets[bi])
                if (k.equals(key))
                    return key;

            buckets[bi].add(key);
            n++;
            validateThreshold();
            return key;
        }

        public K remove(K key) {
            int bi = getBucketIndex(key);
            for (K k : buckets[bi])
                if (k.equals(key)) {
                    buckets[bi].remove(key);
                    n--;
                    return key;
                }
            return null;
        }

        public List<K> values() {
            List<K> ll = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    ll.add(buckets[i].get(j));
                }
            }
            return ll;
        }
        public int size(){
            return n;
        }

        public boolean has(K key) {
            // const bi
            int bi = getBucketIndex(key);
            for (K k : buckets[bi])
                if (k.equals(key))
                    return true;
            return false;
        }

        @SuppressWarnings("unchecked")
        private void validateThreshold() {
            float lambda = 2;
            float curr = (float) n / (float) N;
            if (curr < lambda)
                return;

            LinkedList<K> oldBucket[] = buckets;
            this.N = N * 2;
            this.n = 0;

            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++)
                buckets[i] = new LinkedList<>();

            for (int i = 0; i < oldBucket.length; i++) {
                for (int j = 0; j < oldBucket[i].size(); j++) {
                    K key = oldBucket[i].get(j);
                    int bi = getBucketIndex(key);
                    buckets[bi].add(key);
                    n++;
                }
            }

            System.out.println("Threshold archived");

        }

        private int getBucketIndex(K key) {
            return key.hashCode() % N;
        }

    }

    public static void main(String[] args) {
        hashSet<Integer> set = new hashSet<>();
        set.put(1);
        set.put(1);
        set.put(2);
        System.out.println(set.size());        
        System.out.println(set.values());
        set.put(11);
        set.put(12);
        set.put(23);

        set.put(188);
        set.put(16);
        set.put(26);

        set.put(18877);
        set.put(1677);
        set.put(2677);

        set.remove(1677);

        System.out.println(set.has(100));
        System.out.println(set.size());        
        System.out.println(set.values());

    }
}
