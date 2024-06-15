// // 811. Subdomain Visit Count

// class Solution {
//     public List<String> subdomainVisits(String[] d) {
//         HashMap<String , Integer> map=new HashMap<>();

//         for( String s : d ){
//             String arr[] = s.split(" ");
//             int num = Integer.parseInt(arr[0]);
//             String t = arr[1];
//             String arr2[] = give(t) ;
//             // System.out.print(Arrays.toString(t.split("")));
//             // System.out.print(Arrays.toString(arr2));
            
//             for(int i=0;i<arr2.length;i++){
//                 StringBuilder sb = new StringBuilder();
//                 for(int j=i;j<arr2.length;j++){
//                     sb.append(arr2[j]);
//                     if(j!=arr2.length-1) sb.append(".");
//                 }


//                 if(map.containsKey(sb.toString())) map.put(sb.toString() , map.get(sb.toString())+num);
//                 else map.put(sb.toString() , num);
//             }
//         }

//         // System.out.print(map);
//         List<String> ans = new ArrayList<>();

//         for(String s : map.keySet()){
//             ans.add( ( map.get(s) + " " + s).trim()  );
//         }
//         return ans;
//     }

//     String[] give(String s){
//         List<String> ll = new ArrayList<>();
//         StringBuilder sb =new StringBuilder();

//         for(char ch : s.toCharArray()){
//             if( ischar(ch) ) sb.append(ch);
//             else{
//                 ll.add(sb.toString());
//                 sb = new StringBuilder();
//             }
//         }
//         if(sb.length()>0) ll.add(sb.toString());
//         int n = ll.size();
//         String arr[] = new String[n];
//         for(int i=0;i<n;i++) arr[i] = ll.get(i);

//         return arr;
//     } 

//     boolean ischar(char ch ){
//         return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');
//     }
// }