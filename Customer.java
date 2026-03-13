public class Customer {
    private int CustomerID ;
    private String customerName ;
    private boolean customerGender;

    public Customer(){
        this.CustomerID = 101;
        this.customerName= "Siwat";
        this.customerGender = true;
    }

    public int getCustomerID(){
        return CustomerID;
    }
    public void setCustomerID(int id){
        CustomerID = id;
    }
    private void showDetail(){
        IO.println("Customer Detail");
        IO.println("CustomerID :"+this.CustomerID);
        IO.println("CustomerName : "+this.customerName);
        if(customerGender == true){
            IO.println("your is  male ");
        }else{
            IO.println("your is female");
        }
    }
    public void displayDetail(){
        showDetail();
    }
}
