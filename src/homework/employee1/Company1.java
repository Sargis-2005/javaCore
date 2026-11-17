package homework.employee1;

import java.util.Objects;

public class Company1 {
    private String companyId;
    private String name;
    private  String industry;
    private String country;

    public Company1() {
    }

    public Company1(String companyId, String name, String industry, String country) {
        this.companyId = companyId;
        this.name = name;
        this.industry = industry;
        this.country = country;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Company1{" +
                "companyId='" + companyId + '\'' +
                ", name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company1 company1 = (Company1) o;
        return Objects.equals(companyId, company1.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(companyId);
    }
}
