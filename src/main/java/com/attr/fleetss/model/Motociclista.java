package com.attr.fleetss.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_motociclista")
public class Motociclista implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_motociclista")
    private Long id;

    @Column(name = "nm_nome")
    private String nome;

    @Column(name = "nm_telefone", unique = true)
    private String telefone;

    @Column(name = "nm_cpf", unique = true)
    private String CPF;

    @Column(name = "nm_rg", unique = true)
    private String RG;

    @Column(name = "nm_cnh", unique = true)
    private String CNH;

    @Column(name = "is_ativo")
    private boolean status;

    @Column(name = "dt_nascimento")
    private Date dataNascimento;

    @Column(name = "nm_sexo")
    private int sexo;

    @OneToOne
    @JoinColumn(name = "id_tp_sanguineo")
    private TipoSanguineo tipoSanguineo;

    @OneToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo veiculo;

    @OneToMany(targetEntity = AreaCobertura.class, mappedBy = "motociclista")
    @Column(name = "id_area_cobertura")
    private List<AreaCobertura> areaCobertura;

    @Column(name = "dt_cadastro", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_cadastro;

    public Motociclista(){};

    public Motociclista(String nome, String telefone, String CPF, String RG, String CNH, boolean status, Date dataNascimento, int sexo, TipoSanguineo tipoSanguineo, Veiculo veiculo, List<AreaCobertura> areaCobertura, Date data_cadastro) {
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.RG = RG;
        this.CNH = CNH;
        this.status = status;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.veiculo = veiculo;
        this.areaCobertura = areaCobertura;
        this.data_cadastro = data_cadastro;
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<AreaCobertura> getAreaCobertura() {
        return areaCobertura;
    }

    public void setAreaCobertura(List<AreaCobertura> areaCobertura) {
        this.areaCobertura = areaCobertura;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

}
