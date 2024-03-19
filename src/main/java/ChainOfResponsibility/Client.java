package ChainOfResponsibility;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {

		LeaveApplication leaveApplication = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
				.from(LocalDate.now()).to(LocalDate.of(2024, 2, 28)).build();

		LeaveApprover approver = createChain();
		approver.processLeaveApplication(leaveApplication);
		System.out.println(leaveApplication);

	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);

		return lead;
	}

	
}
