package lession13;

public enum PlatformType {
    IOS("15.5"),
    ANDROID("10.0");

    private String version;
    PlatformType (String version){
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
