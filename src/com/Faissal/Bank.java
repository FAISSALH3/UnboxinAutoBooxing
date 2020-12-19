public class Bank {
    private  String name ;
    private ArrayList<Branch> branches;

    public void Bank(String name )
    {
        this.name = name;
        ArrayList<Branch> branches = new ArrayList<Brnach>();

    }
    public boolean addBranch(String nameOfBranch)
    {
        if(findbranch(nameOfbranch)==null)
        {
            branches.add(nameOfbranch);
            return true;
        }
        return flase;
    }
    public boolean addCustomer(String nameOfBranch , String nameOfCustomer , double initialTransaction)
    {
        if(findCustomer(nameOfcustomer)==null){
            branches.add(nameOfCustomer);
            return false;
        }
        return true;
    }
    public boolean addCustomerTransaction(String nameOfbranch , String nameOfcustomer , double transaction )
    {
        if(listCustomers(nameOfcustomer))
        {
            branches.add(nameOfCustomer);
            true ;
        }
        false;
    }
    public branch findBranch(String nameOfBranch)
    {
        for(int i = 0 ; i <branches.size(); i++)
        {
            Branch checkBranch = this.branches.get(i);
            if(checkbranch.getName().equals(branchName)
            {
                return checkBranch ;
            }
        }
        return true;
    }
    public boolean listCustomers(String nameOfBranch , boolean printTransaxtions)
    {
        if(finbranch(nameOfBranch)== null)
        {
            return true ;
        }
        else
            return false;
    }

}