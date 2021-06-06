package simplon.com.ponionz.domaine.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demandes")

public class Demande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount", unique = true, nullable = false)
    private long amount;

    @Column(name = "apport", nullable = false)
    private long apport;

    @Column(name = "period", nullable = false)
    private int period;

    @Column(name = "interest_rate", nullable = false)
    private double interestRate;

    @Column(name = "insurance_rate", nullable = false)
    private double insuranceRate;

    @Column(name = "is_job_loss_insurance_taken", nullable = false)
    private boolean jobLossInsuranceTaken;

    @Column(name = "job_loss_insurance_taux", nullable = false)
    private int jobLossInsuranceRate;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    public Demande() {
	super();

    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public LocalTime getTime() {
	return time;
    }

    public void setTime(LocalTime time) {
	this.time = time;
    }

    public long getMontant() {
	return amount;
    }

    public void setMontant(long montant) {
	this.amount = montant;
    }

    public long getApport() {
	return apport;
    }

    public void setApport(long apport) {
	this.apport = apport;
    }

    public int getPeriod() {
	return period;
    }

    public void setPeriod(int period) {
	this.period = period;
    }

    public double getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
    }

    public double getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public boolean isJobLossInsuranceTaken() {
	return jobLossInsuranceTaken;
    }

    public void setJobLossInsuranceTaken(boolean jobLossInsuranceTaken) {
	this.jobLossInsuranceTaken = jobLossInsuranceTaken;
    }

    public int getTauxJobLossInsurance() {
	return jobLossInsuranceRate;
    }

    public void setTauxJobLossInsurance(int tauxJobLossInsurance) {
	this.jobLossInsuranceRate = tauxJobLossInsurance;
    }

}
