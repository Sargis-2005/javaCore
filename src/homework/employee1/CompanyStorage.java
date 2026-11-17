package homework.employee1;

public class CompanyStorage {
    private Company1[] company1s = new Company1[10];
    private int size;

    public void addCompany(Company1 company1) {
        if (size == company1s.length) {
            extend();
        }
        company1s[size++] = company1;
    }

    private void extend() {
        Company1[] temp = new Company1[company1s.length + 10];
        for (int i = 0; i < company1s.length; i++) {
            temp[i] = company1s[i];
        }
        company1s = temp;
    }

    public Company1 getByID(String id) {
        for (int i = 0; i < size; i++) {
            if (company1s[i] != null && company1s[i].getCompanyId().equals(id)) {
                return company1s[i];
            }

        }
        return null;
    }
    public void printAll(){
        for (int i = 0; i < size; i++) {
            System.out.println(company1s[i]);

        }
        System.out.println();
    }

}
