
/**
 * healthy lifestyle
 * cholesterol measurement
 * Burak Once
 * burakonce9@gmail.com
*/
public class Person {
    
    String id;
    String gender;
    double tChol;
    double hdl;
    
public Person(String id, String gender, double tChol, double hdl)   {
    
    this.id=id;
    this.gender=gender;
    this.tChol=tChol;
    this.hdl=hdl;
    
}

public double getCholesterolRatio(){
    return (tChol/hdl);
}

public boolean hasGoodTotalCholesterol(){
    if (tChol < 200)
    return true;
    else
    return false;
}
public boolean hasGoodHDL(){
    if (gender.equalsIgnoreCase("MALE")){
        if (hdl >= 40)
        return true;
        else
        return false;
    }
    else if (gender.equalsIgnoreCase("FEMALE")){
        if (hdl >= 45)
        return true;
        else
        return false;
    }
    return true;
}

public boolean hasGoodCholesterolRatio(){
     if (tChol/hdl <= 4.5)
    return true;
    else
    return false;
}
public void printReport() {
    
}
}