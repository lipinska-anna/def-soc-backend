package com.example.defsocbackend.domain;

public class SummaryResult {
    private String idsummary;
    private String summary_text;
    private String summary_text_en;
    private String risk_score;
    private String creation_date;
    private String last_edit;
    private String domain_name;
    private Integer servizi_esposti_score;
    private Integer dataleak_score;
    private Integer rapporto_leak_email_score;
    private Integer spoofing_score;
    private Integer open_ports_score;
    private Integer blacklist_score;
    private Integer vulnerability_score_active;
    private Integer vulnerability_score_passive;
    private Integer certificate_score;
    private PortDetails n_port;
    private Integer n_cert_attivi;
    private Integer n_cert_scaduti;
    private Integer n_asset;
    private Integer n_similar_domains;
    private EmailSecurity email_security;
    private DataLeakDetails n_dataleak;
    private VulnerabilityDetails n_vulns;
    private AssetDetails waf;
    private AssetDetails cdn;
    private Integer unique_ipv4;
    private Integer unique_ipv6;

    public SummaryResult() {
    }

    public SummaryResult(String idsummary, String summary_text, String summary_text_en, String risk_score, String creation_date, String last_edit, String domain_name, Integer servizi_esposti_score, Integer dataleak_score, Integer rapporto_leak_email_score, Integer spoofing_score, Integer open_ports_score, Integer blacklist_score, Integer vulnerability_score_active, Integer vulnerability_score_passive, Integer certificate_score, PortDetails n_port, Integer n_cert_attivi, Integer n_cert_scaduti, Integer n_asset, Integer n_similar_domains, EmailSecurity email_security, DataLeakDetails n_dataleak, VulnerabilityDetails n_vulns, AssetDetails waf, AssetDetails cdn, Integer unique_ipv4, Integer unique_ipv6) {
        this.idsummary = idsummary;
        this.summary_text = summary_text;
        this.summary_text_en = summary_text_en;
        this.risk_score = risk_score;
        this.creation_date = creation_date;
        this.last_edit = last_edit;
        this.domain_name = domain_name;
        this.servizi_esposti_score = servizi_esposti_score;
        this.dataleak_score = dataleak_score;
        this.rapporto_leak_email_score = rapporto_leak_email_score;
        this.spoofing_score = spoofing_score;
        this.open_ports_score = open_ports_score;
        this.blacklist_score = blacklist_score;
        this.vulnerability_score_active = vulnerability_score_active;
        this.vulnerability_score_passive = vulnerability_score_passive;
        this.certificate_score = certificate_score;
        this.n_port = n_port;
        this.n_cert_attivi = n_cert_attivi;
        this.n_cert_scaduti = n_cert_scaduti;
        this.n_asset = n_asset;
        this.n_similar_domains = n_similar_domains;
        this.email_security = email_security;
        this.n_dataleak = n_dataleak;
        this.n_vulns = n_vulns;
        this.waf = waf;
        this.cdn = cdn;
        this.unique_ipv4 = unique_ipv4;
        this.unique_ipv6 = unique_ipv6;
    }

    public String getIdsummary() {
        return idsummary;
    }

    public void setIdsummary(String idsummary) {
        this.idsummary = idsummary;
    }

    public String getSummary_text() {
        return summary_text;
    }

    public void setSummary_text(String summary_text) {
        this.summary_text = summary_text;
    }

    public String getSummary_text_en() {
        return summary_text_en;
    }

    public void setSummary_text_en(String summary_text_en) {
        this.summary_text_en = summary_text_en;
    }

    public String getRisk_score() {
        return risk_score;
    }

    public void setRisk_score(String risk_score) {
        this.risk_score = risk_score;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getLast_edit() {
        return last_edit;
    }

    public void setLast_edit(String last_edit) {
        this.last_edit = last_edit;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public Integer getServizi_esposti_score() {
        return servizi_esposti_score;
    }

    public void setServizi_esposti_score(Integer servizi_esposti_score) {
        this.servizi_esposti_score = servizi_esposti_score;
    }

    public Integer getDataleak_score() {
        return dataleak_score;
    }

    public void setDataleak_score(Integer dataleak_score) {
        this.dataleak_score = dataleak_score;
    }

    public Integer getRapporto_leak_email_score() {
        return rapporto_leak_email_score;
    }

    public void setRapporto_leak_email_score(Integer rapporto_leak_email_score) {
        this.rapporto_leak_email_score = rapporto_leak_email_score;
    }

    public Integer getSpoofing_score() {
        return spoofing_score;
    }

    public void setSpoofing_score(Integer spoofing_score) {
        this.spoofing_score = spoofing_score;
    }

    public Integer getOpen_ports_score() {
        return open_ports_score;
    }

    public void setOpen_ports_score(Integer open_ports_score) {
        this.open_ports_score = open_ports_score;
    }

    public Integer getBlacklist_score() {
        return blacklist_score;
    }

    public void setBlacklist_score(Integer blacklist_score) {
        this.blacklist_score = blacklist_score;
    }

    public Integer getVulnerability_score_active() {
        return vulnerability_score_active;
    }

    public void setVulnerability_score_active(Integer vulnerability_score_active) {
        this.vulnerability_score_active = vulnerability_score_active;
    }

    public Integer getVulnerability_score_passive() {
        return vulnerability_score_passive;
    }

    public void setVulnerability_score_passive(Integer vulnerability_score_passive) {
        this.vulnerability_score_passive = vulnerability_score_passive;
    }

    public Integer getCertificate_score() {
        return certificate_score;
    }

    public void setCertificate_score(Integer certificate_score) {
        this.certificate_score = certificate_score;
    }

    public PortDetails getN_port() {
        return n_port;
    }

    public void setN_port(PortDetails n_port) {
        this.n_port = n_port;
    }

    public Integer getN_cert_attivi() {
        return n_cert_attivi;
    }

    public void setN_cert_attivi(Integer n_cert_attivi) {
        this.n_cert_attivi = n_cert_attivi;
    }

    public Integer getN_cert_scaduti() {
        return n_cert_scaduti;
    }

    public void setN_cert_scaduti(Integer n_cert_scaduti) {
        this.n_cert_scaduti = n_cert_scaduti;
    }

    public Integer getN_asset() {
        return n_asset;
    }

    public void setN_asset(Integer n_asset) {
        this.n_asset = n_asset;
    }

    public Integer getN_similar_domains() {
        return n_similar_domains;
    }

    public void setN_similar_domains(Integer n_similar_domains) {
        this.n_similar_domains = n_similar_domains;
    }

    public EmailSecurity getEmail_security() {
        return email_security;
    }

    public void setEmail_security(EmailSecurity email_security) {
        this.email_security = email_security;
    }

    public DataLeakDetails getN_dataleak() {
        return n_dataleak;
    }

    public void setN_dataleak(DataLeakDetails n_dataleak) {
        this.n_dataleak = n_dataleak;
    }

    public VulnerabilityDetails getN_vulns() {
        return n_vulns;
    }

    public void setN_vulns(VulnerabilityDetails n_vulns) {
        this.n_vulns = n_vulns;
    }

    public AssetDetails getWaf() {
        return waf;
    }

    public void setWaf(AssetDetails waf) {
        this.waf = waf;
    }

    public AssetDetails getCdn() {
        return cdn;
    }

    public void setCdn(AssetDetails cdn) {
        this.cdn = cdn;
    }

    public Integer getUnique_ipv4() {
        return unique_ipv4;
    }

    public void setUnique_ipv4(Integer unique_ipv4) {
        this.unique_ipv4 = unique_ipv4;
    }

    public Integer getUnique_ipv6() {
        return unique_ipv6;
    }

    public void setUnique_ipv6(Integer unique_ipv6) {
        this.unique_ipv6 = unique_ipv6;
    }
}
