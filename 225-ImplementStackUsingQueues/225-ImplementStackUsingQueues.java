// Last updated: 8/12/2025, 12:41:25 AM
import java.util.*;

class MyStack {
    static Queue<Integer> q1;
    static Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int data) {
        if (!q1.isEmpty())
            q1.add(data); //jisme abhi elements h usme hi push karo or first element h toh q2 m daaldo, q1 m bhi daalskte h
        else
            q2.add(data);
    }

    public int pop() {
        if (empty())
            return -1; //bothh empty
        int top = -1;

        //case 1 when elements are in q1
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                if (q1.isEmpty())
                    break; //agr element nikal ke and queue empty hogyi that means vo humara last element tha, or usko vapis push nhi krna
                q2.add(top);
            }
        } else { //case 2 when elements are in q2
            while (!q2.isEmpty()) {
                top = q2.remove();
                if (q2.isEmpty())
                    break;
                q1.add(top);
            }
        }
        return top;
    }

    public int top() {
        if (empty())
            return -1; //bothh empty
        int top = -1;

        //case 1 when elements are in q1
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
        } else { //case 2 when elements are in q2
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
        }
        return top;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty(); //dono empty honi chahiye
    }
}
