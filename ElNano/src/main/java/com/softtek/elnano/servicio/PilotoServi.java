package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.piloto;
import com.softtek.elnano.repo.IPilotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotoServi implements IPilotoServi {
    @Autowired
    private IPilotoRepo repo;
    @Override
    public List<piloto> ObtenerTodos() {
        return null;
    }
}
