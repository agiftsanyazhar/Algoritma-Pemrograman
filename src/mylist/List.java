package mylist;

public class List {
    private int[] data;         // menyimpan data
    private final int maxSize;  // daya tampung list
    private int size;           // jumlah data di dalam list saat ini
    
    // deklarasi constrcutor pertama
    public List(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        this.data = new int[this.maxSize];
    }
    
    // deklarasi constructor kedua
    public List(int maxSize, int maxRandom){
        this.maxSize = maxSize;
        this.size = maxSize;
        data = new int[this.maxSize];
        for(int i=0; i<maxSize; i++)
            this.data[i] = (int) (maxRandom * Math.random());
    }
    
    /**
     * menambah satu item data di belakang
     * @param item 
     */
    public void addRear(int item){
        if(this.size<this.maxSize){
            this.data[this.size] = item;
            this.size++;
        }
    }
    
    /**
     * menampilkan isi List
     */
    public void display(){
        for(int i=0; i<this.size; i++)
            System.out.print(this.data[i]+" ");
        System.out.print("\n\n");
    }
    
    /**
     * menambahkan satu data di awal list dan
     * menggeser semua elemen list ke belakang
     * @param item 
     */
    public void addFront(int item){
        int y;
        for(int i=0; i<this.size; i++){
            y               = this.data[0];
            this.data[0]    = this.data[i+1];
//            this.data[1]    =
        }
        this.data[0] = item;
        this.size++;
    }
    
    /**
     * menghapus satu elemen list (bila item tsb ada)
     * @param item 
     */
    public void delete(int item){
        for (int i=0; i<this.size; i++){
            if (this.data[i]==item){
                for (int j=i; j<this.size-1; j++){
                    this.data[j] = this.data [j+1];
                }
                this.size = this.size-1;
            }
        }
//        for(int i=0; i<this.size; i++){
//            System.out.print(this.data[i]+(" "));
//        }
    }
    
    /**
     * membalikkan elemen list
     */
    public void reverse(){
        int num = this.size-1;
        int temp;
        for(int i=0; i<this.size/2; i++){
            temp             = this.data[i+num];
            this.data[i+num] = this.data[i];
            this.data[i]     = temp;
            num              = num-2;
        }
    }
    
    /**
     * mengembalikan nilai modus / data yang paling sering muncul
     * @return data yang paling sering muncul
     */
    public int modus(){
        int result      = 0;
        int countLast   = 0;
        for(int i=0; i<this.size; i++){
            int count = 0;
            for(int j=0; j<this.size; j++){
                if (this.data[i]==this.data[j]){
                    count++;
                }
            }
            if (countLast<count){
                result      = this.data[i];
                countLast   = count;
            }
        }
        return result;
    }
}