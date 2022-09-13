package pageObject.herokuapp;

public enum HomeWorkNavigation {

DYNAMIC_CONTROLS("Dynamic Controls");

    private String item;

    HomeWorkNavigation(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
