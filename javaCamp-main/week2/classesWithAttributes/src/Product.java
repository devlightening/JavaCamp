public class Product {

    public Product() {
        System.out.println("Yapıcı blok çalıştı");
    }

    //attribute | field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;


    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String getRenk() {

        return _renk;
    }

    public void setRenk(String renk) {
        this._renk = renk;
    }

    public String getKod() {
        return _kod;
    }

    public void setKod(String kod) {
        this._kod = kod;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}

