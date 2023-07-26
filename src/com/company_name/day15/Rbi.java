package com.company_name.day15;

//parent class
public class Rbi {

    double getRoi()
    {
        return 8.0;
    }

}

class Hdfc extends Rbi{
    double getRoi()
    {
        return 6.5;

    }
}

class Icici extends Rbi{
    double getRoi()
    {
        return 7.5;
    }
}

class Sbi extends Rbi{
    double getRoi()
    {
        return 5.8;
    }
}