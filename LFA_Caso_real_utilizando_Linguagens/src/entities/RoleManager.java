package entities;

import java.util.ArrayList;
import java.util.List;

import directory.FileHandler;

public class RoleManager {
	
	private List<Role> roles = null;
	private FileHandler<List<Role>> file = new FileHandler<List<Role>>("roles.dat");
	
	public RoleManager() {
		
		try {
			roles = file.read();
		}
		catch (Exception e){
			System.out.println("Exception: " + e);
		}
		
		if (roles == null) {
			roles = new ArrayList<Role>();
		}
		
		if (roles.isEmpty()) {
			roles.add(new Role("admin", 1));
			file.save(roles);
		}
	}

	public Role createRole(Role role, int level) {
		Role newrole = null;
		
		if (this.haveAcess(role, level)) {
			System.out.println("Sem autorização!");
			return newrole;
		}
		
		for (int i = 0; i < roles.size(); i++) {
			if (roles.get(i).getLevel() == level) {				
				newrole = roles.get(i);
				break;
			}
		}
		return newrole;
    }
	
	public void addRole(Role role, String newname, int newlevel) {
		
		if (this.haveAcess(role, newlevel)) {			
			Role newrole = new Role(newname, newlevel);
			roles.add(newrole);
		}
		else {
			System.out.println("Sem autorização!");
		}
		file.save(roles);
    }
	
	public int getLevelMax() {
        int levelmax = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        for (Role role : roles) { // Itera sobre todos os valores do enum
            if (role.getLevel() > levelmax) {
                levelmax = role.getLevel();
            }
        }
        
        return levelmax;
    }
	
	public boolean haveAcess(Role role, int level) {
		return level < role.getLevel();
	}
}
