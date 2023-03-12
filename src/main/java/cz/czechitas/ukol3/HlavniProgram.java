package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */


public class HlavniProgram {

    public static void main(String... args) {

        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac marcinPocitac = new Pocitac();
//        System.out.println(marcinPocitac.toString());
////       marcinPocitac.zapniSe(null,null,null);

        Disk marcinDisk = new Disk();
        marcinDisk.setKapacita(254_548_554_547L);
        marcinDisk.setVyuziteMisto(222_256_458_230L);

        Pamet marcinaPamet = new Pamet();
        marcinaPamet.setKapacita(8_000_000_000L);


        Procesor marcinProcesor = new Procesor();
        marcinProcesor.setRychlost(5_300_000_000_000L);
        marcinProcesor.setVyrobce("AMD");

        marcinPocitac.setPevnyDisk(marcinDisk);
        marcinPocitac.setRam(marcinaPamet);
        marcinPocitac.setProcesor(marcinProcesor);


        marcinPocitac.zapniSe();
        System.out.println(marcinPocitac.toString());
        marcinPocitac.vytvorSouborOVelikosti(254_457_578L);
        System.out.println(marcinPocitac.toString());
        marcinPocitac.smazSouborOVelikosti(988_589_999_587_568L);
        System.out.println(marcinPocitac.toString());

        marcinPocitac.vytvorSouborOVelikosti(254_548_554_548L);
        System.out.println(marcinPocitac.toString());
    }
}


