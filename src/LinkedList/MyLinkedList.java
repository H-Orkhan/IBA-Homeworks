//package LinkedList;
//import javax.transaction.xa.Xid;
//import java.util.StringJoiner;
//
//public class MyLinkedList {
//        static class XItem {
//            int value;
//            XItem next;
//            XItem prev;
//
//            public XItem(int value) {
//                this.value = value;
//            }
//
//            public static void merge(MyLinkedList head1, MyLinkedList head2) {
//                XItem current1 = head1;
//            }
//        }
//
//        private XItem head;
//        private XItem end;
//
//        public void add(int value) {
//            XItem item = new XItem(value);
//            if (head == null) {
//                head = item;
//            } else {
//                XItem current = head;
//                while (current.next != null) {
//                    current = current.next;
//                }
//                current.next = item;
//            }
//        }
//
//        public boolean contains(int value) {
//
//            XItem current = head;
//            while (current != null) {
//                if (current.value == value) return true;
//                current = current.next;
//            }
//            return false;
//        }
//
//        public void remove(int value) {
//            XItem current = head;
//            if (head == null) throw new IllegalArgumentException("The list is empty"); // When it is empty
//            while (current.next != null) {
//
//                if (head.value == value) {   //Remove first
//                    head = current.next;
//                    continue;
//
//                }
//
//                else if (current.next.value == value && current.next.next == null) { // Remove last
//                    current.next = null;
//                    continue;
//                }
//
//                else if (current.next.value == value) { // Remove middle
//                    current.next = current.next.next;
//                    continue;
//                }
//                current = current.next;
//            }
//        }
//
//        public void revert () {
//            XItem current = head;
//            XItem prev = null;
//            XItem temp;
//
//            while (current.next!=null) {
//                temp = current.next;
//                current.next = prev;
//                prev = temp;
//            }
//            head = prev;
//        }
//
//        public String toString() {
//            StringJoiner sj = new StringJoiner(",");
//            XItem current = head;
//            while (current != null) {
//                sj.add(String.valueOf(current.value));
//                current = current.next;
//            }
//            return sj.toString();
//        }
//
//    public int length_naive() {
//        XItem curr = head;
//        int len = 0;
//        while(curr != null) {
//            len++;
//            curr = curr.next;
//        }
//        return len;
//    }
//    // ----------------------------------------
//    public int length_rec(XItem curr) {
//        if (curr == null) return 0;
//        return length_rec(curr.next) + 1;
//    }
//
//    public int length() {
//        return length_rec(head);
//    }
//    // ----------------------------------------
//    public int length_rec2(XItem curr,int count) {
//        if (curr == null) return count;
//        return length_rec2(curr.next,count+1);
//    }
//
//    public int length2() {
//        return length_rec2(head,0);
//    }
//    // ----------------------------------------
//    XItem merge(MyLinkedList x2) {
//
//    }
//}
