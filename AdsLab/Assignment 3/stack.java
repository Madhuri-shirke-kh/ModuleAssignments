class stack{
     static final int MAX=10;
	int top;
	int a[]=new int[MAX];
	stack()
	{
		top=-1;
	}
	 boolean isempty()
	 {
		return (top<0);
	 }
	 //insertion in stack
	 
	 boolean push(int x)
	 {
	   if(top>=MAX-1)
	   {
	   System.out.println("stack is overflow");
	   return false;
	   }
	   a[++top]=x;
	   return true;
	  }
	  //deletion
	  int pop()
	  {
	      if(top<0)
		  {
		  System.out.println("stack is underflow:");
		  return 0;
		  }
		  return a[--top];
		  
	}
	
	int peek()
	{
		return(top<0?-1:a[top]);
	}
	
	void display()
	{
		if(isempty())
		{
			System.out.println("Empty stack");
			
		}
		else
		System.out.println("Stack elements are:");
		show(top);
		System.out.println();
	}
	
	void show(int index)
	{
	 if(index<0)
		return;
		System.out.println(a[index]+" ");
		show(index-1);
	}
	public static void main(String args[])
	{
	
		stack op=new stack();
		op.push(10);
		op.push(20);
		op.push(30);
		op.display();
		op.pop();
		op.display();
	}
}
			