package module;

public class product {
    private int idProduct;
    private String nameProduct;
    private float price;
    private String image;

    public product(int idProduct, String nameProduct, float price, String image) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.image = image;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
