package org.example.oleg.menu;

import org.example.oleg.event.IEvent;

public abstract class MenuFactory {
	private String title;
	private MenuFactory rootMenu;
	private MenuFactory[] subMenus;
	private IEvent event;
	private String help;

	/**
	 * @param event
	 *            the title to get
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param event
	 *            the title to get
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the rootMenu
	 */
	public MenuFactory getRootMenu() {
		return rootMenu;
	}

	/**
	 * @param rootMenu
	 *            the rootMenu to set
	 */
	public void setRootMenu(MenuFactory rootMenu) {
		this.rootMenu = rootMenu;
	}

	/**
	 * @return the subMenus
	 */
	public MenuFactory[] getSubMenus() {
		return subMenus;
	}

	/**
	 * @param subMenus
	 *            the subMenus to set
	 */
	public void setSubMenus(MenuFactory[] subMenus) {
		this.subMenus = new MenuFactory[subMenus.length];
		this.subMenus = subMenus;
		this.setHelp();

	}

	/**
	 * @return the event
	 */
	public IEvent getEvent() {
		return event;
	}

	/**
	 * @param event
	 *            the event to set
	 */
	public void setEvent(IEvent event) {
		this.event = event;
	}

	/**
	 * @return the help
	 */
	public String getHelp() {
		return help;
	}

	/**
	 * @param help
	 *            the help to set
	 */
	public void setHelp() {
		StringBuilder builder = new StringBuilder();
		if (this.subMenus.length > 0) {
			

			for (int i = 0; i < this.subMenus.length; i++) {
				builder.append(i + 1).append(" - ").append(this.subMenus[i].getClass()).append("; ");
			}
			builder.append("0 - break");
			this.help = builder.toString();
		}
		
	}

}