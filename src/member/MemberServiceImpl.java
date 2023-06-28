package member;

public class MemberServiceImpl implements MemberService {
	private static MemberServiceImpl instance = null;
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {
		if (instance == null) {
			instance = new MemberServiceImpl();
		}
		return instance;
	}
}
