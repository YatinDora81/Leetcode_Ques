// class Solution {

//     public String encode(List<String> strs) {
//         if(strs.size()==0) return "";
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<strs.size();i++){
//             sb.append(strs.get(i));
//             sb.append("#__#");
//         }
//         return sb.toString();
//     }

//     public List<String> decode(String str) {
//         List<String> ll = new ArrayList<>();
//         if(str.length()==0) return ll;
//         // System.out.println(str);
//         String arr[] = str.split("#__#");
//         if(arr.length==0) ll.add("");
//         // System.out.println(Arrays.toString(arr));
//         for(String s : arr) ll.add(s);
//         return ll; 
//     }
// }
