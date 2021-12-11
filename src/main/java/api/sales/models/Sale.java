package api.sales.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="sales")
public class Sale {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sale;
    private Integer id_employee;
    private Integer id_branch_office;
    private String name_branch_office;
    private Double total_sale;
    private String description;
    //@Temporal(TemporalType.DATE)
    private String date_sale;
    private String name_employee;

    public Sale() {}

    public Sale(Long id_sale, Integer id_employee, Integer id_branch_office, String name_branch_office, Double total_sale, String description,
                    String date_sale, String name_employee) {
            this.id_sale = id_sale;
            this.id_employee = id_employee;
            this.id_branch_office = id_branch_office;
            this.name_branch_office = name_branch_office;
            this.total_sale = total_sale;
            this.description = description;
            this.date_sale = date_sale;
            this.name_employee = name_employee;
    }
	
}
