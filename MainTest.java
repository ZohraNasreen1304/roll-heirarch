package role;

public class MainTest {

	public static void main(String[] args) {
		Devos d = new Devos();
		
		d.coo();
		d.cto();
		d.managerEngineer();
		d.Engineer();
		d.Devops();
		d.Developer();
		d.Tester();
		Developer d1 = new Developer();

		d1.coo();
		d1.cto();
		d1.managerEngineer();
		d1.Engineer();
		d1.Devops();
		d1.Developer();
		d1.Tester();
		Tester t = new Tester();
		t.coo();
		t.cto();
		t.managerEngineer();
		t.Engineer();
		t.Devops();
		t.Developer();
		t.Tester();
		MarketingAnalyst ma = new MarketingAnalyst();
		ma.coo();
		ma.cto();	
		ma.Engineer();
		ma.manageranalyst();
		ma.managermarketing();
		ma.Marketing();
		ma.MarketingAnalyst();
		ma.MarketingExecutive();
		
		MarketingExecutive me = new MarketingExecutive();
		me.coo();
		me.cto();	
		me.Engineer();
		me.manageranalyst();
		me.managermarketing();
		me.Marketing();
		me.manageranalyst();
		me.MarketingExecutive();
}
}
