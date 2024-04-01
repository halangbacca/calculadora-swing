package br.com.cod3r.calc.model;

@FunctionalInterface
public interface MemoriaObserver {
    public void valorAlterado(String novoValor);
}
