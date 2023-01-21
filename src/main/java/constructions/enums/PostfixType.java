package constructions.enums;

public enum PostfixType {
    INCREMENT("++"),
    DECREMENT("--");

    private final String postfix;

    PostfixType(String value)
    {
        this.postfix = value;
    }

    public static PostfixType getType(String postfix) {
        for(PostfixType p: PostfixType.values()) {
            if(p.postfix.equals(postfix)) {
                return p;
            }
        }
        return null;
    }

    public String toString() {
        return this.postfix;
    }
}
