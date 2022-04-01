package com.lti.genericsdemo;

//bounded Types 
/*class ElectronicItem
{
	int mp;
}*/

class Mobile{
	
    private String brand;
    private String model;

    Mobile(String br, String mo) {
        brand = br;
        model = mo;
    }
    void brandAndModel() {
        System.out.println(brand + " -> " + model);
    }
}

class GalaxyS9 extends Mobile {

    GalaxyS9() {
        super("Samsung", "GalaxyS9");
    }
}

class GalaxyNote9 extends Mobile {

    GalaxyNote9() {
        super("Samsung", "GalaxyNote9");
    }
}

//bounded Types - upper bound 
// accpet subtyes // read obly 

	    //Mobile
// GalaxyS9      GalaxyNote9


class Gen<T extends Mobile> {

    T t;

    Gen(T tt) {
        t = tt;
    }

    void show() {
        t.brandAndModel();
    }
}

public class Javaapp4 {

    public static void main(String[] args) {

        Gen<GalaxyS9> mgen1 = new Gen<GalaxyS9>(new GalaxyS9());
        mgen1.show();

        Gen<GalaxyNote9> mgen2 = new Gen<GalaxyNote9>(new GalaxyNote9());
        mgen2.show();

        Gen<Mobile> mgen3 = new Gen<Mobile>(new Mobile("Samsung", "A7"));        
        mgen3.show();
        
        //Gen<ElectronicItem> mgen4 = new Gen<ElectronicItem>(new ElectronicItem());        
       // mgen3.show();
               
        mgen3 = new Gen<Mobile>(new GalaxyS9());
        mgen3.show();
        
        
        mgen3 = new Gen<Mobile>(new GalaxyNote9());
        mgen3.show(); 
    } 
    
    
    
    
    
    
    
    
}