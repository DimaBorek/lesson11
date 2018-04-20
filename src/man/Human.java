package man;

import com.company.Product;

import javax.naming.Name;
import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;

public class Human{
    String name;
    String charisma;
    int force;
    int money;
    int intelligence;
    ArrayList<Product> products = new ArrayList<Product>();

    @Override
    public String toString(){
        return "Human(" +
        "name"+ name +
        "charisma"+ charisma +
        "force" + force +
        "money" + money +
        "intelligence" + intelligence +
        ")";

    }



}