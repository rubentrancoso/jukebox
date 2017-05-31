package com.doteva.jukebox;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doteva.jukebox.data.domain.Playlist;
import com.doteva.jukebox.data.domain.Rank;
import com.doteva.jukebox.data.domain.Session;
import com.doteva.jukebox.data.domain.Tune;
import com.doteva.jukebox.data.domain.User;
import com.doteva.jukebox.data.repository.PlaylistDAO;
import com.doteva.jukebox.data.repository.RankDAO;
import com.doteva.jukebox.data.repository.SessionDAO;
import com.doteva.jukebox.data.repository.TuneDAO;
import com.doteva.jukebox.data.repository.UserDAO;

@SpringBootApplication
public class JukeboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(JukeboxApplication.class, args);
	}
	
	@PostConstruct
	private void init() {
		User user;
		List<Playlist> playlists;
		Playlist playlist;
		List<Tune> tunes;
		Tune tune;
		List<Session> sessions;
		Session session;
		Rank rank;
		List<Rank> rankList;

		playlists = new ArrayList<Playlist>();
		playlist = new Playlist();
		sessions = new ArrayList<Session>();
		session = new Session();
		tunes = new ArrayList<Tune>();
		rankList = new ArrayList<Rank>();
		
		user = new User();
		user.setUsername("dj1");
		userDAO.save(user);
		user = new User();
		user.setUsername("dj2");
		userDAO.save(user);
		user = new User();
		user.setUsername("voter");
		userDAO.save(user);
		
		tune = new Tune("Rock");
		tuneDAO.save(tune);
		tunes.add(tune);
		rank = new Rank();
		rank.setTune(tune);
		rank.setVotes(4L);
		rankDAO.save(rank);
		rankList.add(rank);
		
		tune = new Tune("Soul");
		tuneDAO.save(tune);
		tunes.add(tune);
		rank = new Rank();
		rank.setTune(tune);
		rank.setVotes(3L);
		rankDAO.save(rank);
		rankList.add(rank);
		
		playlist.setTunes(tunes);
		user = userDAO.findOne(1L);
		playlist.setUser(userDAO.findOne(1L));
		playlistDAO.save(playlist);
		userDAO.save(user);

		playlist = new Playlist();

		tunes = new ArrayList<Tune>();
		tune = new Tune("Disco");
		tuneDAO.save(tune);
		tunes.add(tune);
		rank = new Rank();
		rank.setTune(tune);
		rank.setVotes(2L);
		rankDAO.save(rank);
		rankList.add(rank);
		
		tune = new Tune("Classic");
		tuneDAO.save(tune);
		tunes.add(tune);
		rank = new Rank();
		rank.setTune(tune);
		rank.setVotes(1L);
		rankDAO.save(rank);
		rankList.add(rank);
		
		playlist.setTunes(tunes);
		playlist.setUser(userDAO.findOne(2L));
		playlistDAO.save(playlist);
		
		session.setUser(user);
		session.setRank(rankList);
		sessions.add(session);
		playlists.add(playlist);
		sessionDAO.save(session);

		user.setPlaylist(playlists);
		user.setSessions(sessions);		
		userDAO.save(user);
	}
	
	@Autowired
	TuneDAO tuneDAO;
	
	@Autowired
	PlaylistDAO playlistDAO;
	
	@Autowired
	SessionDAO sessionDAO;	
	
	@Autowired
	RankDAO rankDAO;
	
	@Autowired
	UserDAO userDAO;	
	
	
	
}
