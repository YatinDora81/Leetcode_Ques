// // 468. Validate IP Address

// class Solution {
//     public String validIPAddress(String s) {
//         if(s.startsWith(":") || s.endsWith(":") || s.startsWith(".") || s.endsWith(".")) return "Neither";
//         if(s.contains(":")){
//             String arr[] = s.split(":");
//             if(arr.length!=8) return "Neither";
//             // System.out.print(Arrays.toString(arr));
//             for(String t : arr){
//                 if(t.length()==0 || t.length()>4) return "Neither";
//                 for(char ch : t.toCharArray()) if(!validip6(ch)) return "Neither";
//             }
//             return "IPv6";
//         }

//         if(ischar(s)) return "Neither";  
//         String arr[] = splitkr(s);
//         if(arr.length!=4) return "Neither";
//         // System.out.print(Arrays.toString(arr));
//         for(String t  : arr){
//             if(t.length()>3 || t.length()==0) return "Neither";
//             if( !(noLeadingZero(t))) return "Neither"; 
//             if( greater(t) ) return "Neither";
//         }
//         // System.out.print("4864");

//         return "IPv4";
//     }

//     String[] splitkr(String s){
//         List<String> ll = new ArrayList<>();
//         StringBuilder sb = new StringBuilder("");
//         for(char ch : s.toCharArray()){
//             if(ch=='.'){
//                 ll.add(sb.toString());
//                 sb= new StringBuilder();
//             }
//             else{
//                 sb.append(ch);
//             }
//         }
//         if(sb.length()>0) ll.add(sb.toString());
//         String ann[] = new String[ll.size()];
//         for(int i=0;i<ll.size();i++){
//             ann[i] = ll.get(i);
//         }
//         return ann;
//     }

//     boolean greater(String s){
//         return (Integer.parseInt(s)>255);
//     }

//     boolean noLeadingZero(String s){
//         int i=0;
//         if(s.length()==1) return true;
//         while(i<s.length() && s.charAt(i)=='0') i++;
//         if(i>0) return false;
//         return true;
//     }

//     boolean ischar(String s){
//         for(char ch : s.toCharArray()){
//             if( !((ch>='0' && ch<='9') || ch=='.') ) return true;
//         }
//         return false;
//     }

//     boolean validip6(char ch){
//         return (ch>='0' && ch<='9') || (ch>='a' && ch<='f') || (ch>='A' && ch<='F');
//     }
// }