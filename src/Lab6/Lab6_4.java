package Lab6;

public class Lab6_4 {
    public static void main(String[] args) {
        String url="https://google.com";
        String isHttps = url.contains("https")? "The url use: " +url.substring(0,url.indexOf(":")) :"the url use: "+url.substring(0,url.indexOf(":"));
        String domainName=url.substring(url.indexOf("google"));
        String isDotCom = url.contains(".com")? "The url use: " + url.substring(url.indexOf(".")+1) : "the url is " + url.substring(url.indexOf(".")+1);
        System.out.println(isHttps);
        System.out.println(isDotCom);
        System.out.println("the domain name: " + domainName);

    }
}
