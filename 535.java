// // 535. Encode and Decode TinyURL

// public class Codec {
//     HashMap<String,String> map = new HashMap<>();
//     // Encodes a URL to a shortened URL.
//     public String encode(String longUrl) {
//         String enc = longUrl.hashCode() + "";
//         map.put(enc , longUrl);
//         return enc;
//     }

//     // Decodes a shortened URL to its original URL.
//     public String decode(String shortUrl) {
//         return map.get(shortUrl);
//     }
// }

// // Your Codec object will be instantiated and called as such:
// // Codec codec = new Codec();
// // codec.decode(codec.encode(url));