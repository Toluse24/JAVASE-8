class Sound{
    public static void main(String args[]){
        double ti, sd, dist;

        ti = 7.2; //time interval
        sd = 1100; //sound distance in feets per second through the air

        dist = ti * sd;

        System.out.println("The lightning is " + dist + " feets away");
    }
}