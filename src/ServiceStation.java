public  class ServiceStation {



    public void check(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport car = transports[i];
            car.servis();

        }

    }


}
