package learning;

public class myClass {
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    String label;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value;
    public myClass(String label, String value) {
        this.label=label;
        this.value=value;
    }

    @Override
    public boolean equals(Object obj) {
        myClass o = (myClass) obj;
        return value.equalsIgnoreCase(o.value);
    }
}
