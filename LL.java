package ds_endsem;

class Node
{
	int data;
	Node next;
	Node(){
		data=0;
		next=null;
	}
	Node(int d,Node n)
	{
		data=d;
		next=n;
	}
	void print()
	{
		System.out.println(data);
	}
	void setNext(Node p)
	{
		next=p;
	}
	Node getNext()
	{
		return next;
	}
	int getData()
	{
		return data;
	}
	
}
class LL{
	Node head;
	LL()
	{
		head=null;
	}
	public void insert_to_head(int d)
	{
		if(head==null)
		{
			head=new Node(d,null);
		}
		else
		{
			Node temp=new Node(d,head);
			head=temp;
		}
	}
	public void insert_to_tail(int d)
	{
		Node t=head;
		if(t.getNext()!=null)
		{
			t=t.getNext();
		}
		t.setNext(new Node(d,null));
	}
	public void insert_after(int pos,int d)
	{
		Node temp=head;
		while(pos>1)
		{
			temp=temp.getNext();
			pos--;
		}
		Node newn=new Node(d,temp.getNext());
		temp.setNext(newn);
	}
	public int delete_from_head()
	{
		int val=head.getData();
		head=head.getNext();
		return val;
		}
	public int delete_tail()
	{
		Node t=head;
		Node prev=null;
		while(t.getNext()!=null)
		{
			prev=t;
			t=t.getNext();
		}
		int val=t.getData();
		prev.setNext(null);
		return val;
	}
	public int delete_node(int pos)
	{
		Node temp=head;
		Node prev=head;
		while(pos>1 && temp.getNext()!=null)
		{
			prev=temp;
			temp=temp.getNext();
			pos--;
		}
		int data=temp.getData();
		if(prev==temp)
		{
			head=head.getNext();
		}
		else
		{
			prev.setNext(temp.getNext());
		}
		return data;
	}
	public boolean search_key(int key)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.getData()==key)
			{
				return true;
			}
			temp=temp.getNext();
		}
		return false;
	}
}
public class LList {

	public static void main(String[] args) {
		LL l1=new LL();
		
		l1.insert_to_head(32);
		l1.insert_to_head(12);
		l1.insert_to_head(90);
		

	}

}
