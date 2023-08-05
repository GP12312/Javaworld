package PsU.LazyLoading.VirtualProxy;

public class Company {
	
	 String companyName;
	 String companyAddress;
	 String companyContactNumber;
	 ContactList cotl;

	public Company(String cN, String cA, String cCN, ContactList cl) {
		this.companyName = cN;
		this.companyAddress =cA;
		this.companyContactNumber = cCN;
		this.cotl = cl;				
	}
	
    public String getCompanyName()
    {
        return companyName;
    }
    public String getCompanyAddress()
    {
        return companyAddress;
    }
    public String getCompanyContactNo()
    {
        return companyContactNumber;
    }
    public ContactList getContactList()
    {
        return cotl;
    }

}
