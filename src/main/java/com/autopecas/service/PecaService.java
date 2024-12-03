package com.autopecas.service;

import com.autopecas.model.Peca;
import com.autopecas.repository.PecaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PecaService {

    private final PecaRepository pecaRepository;

    public PecaService(PecaRepository pecaRepository) {
        this.pecaRepository = pecaRepository;
    }

    public List<Peca> listarTodas() {
        return pecaRepository.findAll();
    }

    public Optional<Peca> buscarPorId(Long id) {
        return pecaRepository.findById(id);
    }

    public Peca salvar(Peca peca) {
        return pecaRepository.save(peca);
    }

    public void deletar(Long id) {
        pecaRepository.deleteById(id);
    }
}
