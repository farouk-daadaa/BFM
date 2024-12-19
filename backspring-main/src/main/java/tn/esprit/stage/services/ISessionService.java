package tn.esprit.stage.services;

import tn.esprit.stage.entities.Pack;
import tn.esprit.stage.entities.Session;

import java.util.List;

public interface ISessionService{
    Session addSession(Session s);

    public void removeSession(Long idSession);

    public Session modifiySession(Long idSession, Session updateSession);

    public List<Session> retrieveAllSession();
    public Session retrieveSession(Long id);
    public void assignMaterialToSession(Long sessionId, Pack pack);
}
