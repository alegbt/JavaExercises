import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    String priceType;
    double priceInEuros;

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        clonedSmartphonePrice.priceType = this.priceType;
        clonedSmartphonePrice.priceInEuros = this.priceInEuros;
        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return "SmartphonePrice attributes: "+priceType+priceInEuros;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice smartphonePrice = (SmartphonePrice) o;
        return Objects.equals(this.priceType, smartphonePrice.priceType) &&
                Objects.equals(this.priceInEuros, smartphonePrice.priceInEuros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType,priceInEuros);
    }

    public SmartphonePrice(){}   //senza un costruttore vuoto mi dava errore ma poi si e' risolto, nel dubbio l'ho lasciato

    public SmartphonePrice(String type, double price){
        this.priceType=type;
        this.priceInEuros=price;
    }


}
