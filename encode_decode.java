public class Codec {
    
    String AlphaNumeric = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    HashMap<String, String> map = new HashMap<String, String>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        //we generate a random string with size of 6
        for(int i = 0; i < 6; i++)
        {
            int charIndex = (int) (AlphaNumeric.length() * Math.random());
            sb.append(AlphaNumeric.charAt(charIndex));
        }
        String shortUrl = "http://tinyurl.com/" + sb.toString();
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
