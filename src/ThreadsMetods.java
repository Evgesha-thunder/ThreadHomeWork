public class ThreadsMetods {
    public  float[] fullOfOne(float [] array){
        long time = System.currentTimeMillis();

        for (int i = 0; i<1000000; i++){
            array[i] = 1;
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }


        //  System.out.println(System.currentTimeMillis() - time);
        return array;
    }

    public  void  devideOnTwo (float [] array){
        System.out.println(System.currentTimeMillis());
        int h = array.length/2;
        float [] array2 = new float[h];
        float [] array1= new float[h];
 Thread t1 = (Thread) new java.lang.Thread(new Runnable2() {
     @Override
     public void run() {
         System.arraycopy(array, 0, array1, 0, array1.length);
             for (int i = 0; i < array1.length; i++) {
                 array1[i] = (float) (array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

         }
     }
 });
        Thread t2 = (Thread) new java.lang.Thread(new Runnable2() {
            @Override
            public void run() {
                System.arraycopy(array, h, array2, 0, array2.length);
                for (int i = 0; i < array1.length; i++) {
                    array2[i] = (float) (array2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

                }
            }
        });
        System.out.println(System.currentTimeMillis());

        System.arraycopy(array1, 0, array, 0, h);
        System.arraycopy(array2, 0, array, h,h);


        System.out.println(System.currentTimeMillis());

    }
}
