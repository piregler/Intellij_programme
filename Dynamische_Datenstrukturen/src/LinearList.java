import java.sql.SQLOutput;

public class LinearList {
    ListElement header;

    void addFirst(int value){
        //insert a new element to the list
        ListElement temp = new ListElement();
        temp.data = value;
        temp.next = header;
        header = temp;
    }

    void removeFirst(){
        //deletes the first element in the list
        if(!isEmpty()){
            header = header.next;
        }
    }

    int getFirst(){
        //returns the first element of the list
        if(!isEmpty()){
            return header.data;
        }
        return 0;
    }

    void removeLast(){
        //seems like it is working
        //deletes the last element in the list
        if(isEmpty()){
            System.out.println("The list was already empty.");
        }
        //is this really the right way to do this?
        else if(header.next == null){
            header = null;
        }
        else{
            ListElement last = header;
            ListElement temp = header.next;
            do{
                if (temp.next == null){
                    //remove element
                    last.next = null;
                }
                else{
                    last = temp;
                    temp = temp.next;
                }
            }while(last.next != null);
        }
    }

    int getLast(){
        //seems like it is working
        //returns the last element of the list
        if(isEmpty()){
            return 0;
        }
        else{
            ListElement temp = header;
            do{
                if (temp.next == null){
                       return temp.data;
                }
                else{
                    temp = temp.next;
                }
            }while(temp.next != null);
            return temp.data;
        }
    }
    
    int size(){
        //returns the size of the list
        //TODO how can I do it better( faster, easier, prettier)?
        int count = 0;
        if(!isEmpty()){
            count++;
            ListElement temp = header.next;
            while(temp != null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    boolean isEmpty(){
        //returns true if the list has no elements
        return header == null;
    }

    void output(){
        //output of the data values on the console
        ListElement temp = header;
        System.out.print("\n( ");
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println(")");
    }



    void addLast(int value){
        //insert a new element at the end of the list
        ListElement temp = header;
        while(temp.next != null){
            temp = temp.next;
        }
        ListElement last = new ListElement();
        last.data = value;
        temp.next = last;
    }
}
