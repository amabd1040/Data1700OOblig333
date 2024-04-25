package com.example.data1700ooblig333;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillettRepository {

    @Autowired
    private JdbcTemplate db;

    private Logger logger = LoggerFactory.getLogger(BillettRepository.class);

    public boolean lagreBillett(Billett billett) {
        String sql = "INSERT INTO Billett(film, antall, fornavn, etternavn, mobilnummer, epost) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            db.update(sql, billett.getFilm(), billett.getAntall(), billett.getFornavn(), billett.getEtternavn(), billett.getMobilnummer(), billett.getEpost());
            return true;
        } catch (Exception e) {
            logger.error("Kunne ikke lagre billett " + e);
            return false;
        }
    }
    public List<Billett> hentAlle() {
        String sql = "SELECT film, antall, fornavn, etternavn, telefon, epost FROM Ticket ORDER BY etternavn";
        try {
            return db.query(sql, new BeanPropertyRowMapper<>(Billett.class));
        } catch (Exception e) {
            logger.error("Kunne ikke hente billetter " + e);
            return null;
        }
}
    public boolean slettAlle() {
        String sql = "DELETE FROM Billett;";
        try {
            db.update(sql);
            return true;
        } catch (Exception e) {
            logger.error("Kunne ikke slette billetter " + e);
            return false;
        }
    }
}

