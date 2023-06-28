package event;

public class EventServiceImpl implements EventService {
	private static EventServiceImpl instance = null;
	private EventServiceImpl() {}
	public static EventServiceImpl getInstance() {
		if (instance == null) {
			instance = new EventServiceImpl();
		}
		return instance;
	}

}
