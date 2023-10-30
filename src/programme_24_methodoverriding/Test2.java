package programme_24_methodoverriding;
//Test class to creat objects and call the methods
 class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("SBI rate of interest : " + s.getReadyOfInterest());
        System.out.println("ICICI rate of interest : " + i.getRateOfInterest());
        System.out.println("AXIS rate of interest : " + a.getRateOfInterest());
    }
}
