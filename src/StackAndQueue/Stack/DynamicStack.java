package StackAndQueue.Stack;

public class DynamicStack extends CustomImplemnetation{
    public DynamicStack() {
        super(); // it will call CustomStack
    }
    public DynamicStack(int size){
        super(); // it will call CustomStack(int size)
    }
    @Override
    public boolean push(int item){
        //this takes cares of of it beigng full
        if(this.isFull()){
            // double the array size
            int [] temp = new int[data.length * 2];

            // copy all prev items in new data
            for(int i=0; i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        //at this point we know that array is not full
        //insert item
        return super.push(item);

    }
}
