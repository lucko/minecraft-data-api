/*
 * Copyright (C) 2016 Florian Stober
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.codecrafter47.data.bungee.bungeeperms3;

import net.alpenblock.bungeeperms.BungeePerms;
import net.alpenblock.bungeeperms.Group;
import net.alpenblock.bungeeperms.PermissionsManager;
import net.alpenblock.bungeeperms.User;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.function.Function;

public class BungeePermsMainGroupProvider implements Function<ProxiedPlayer, String> {
    @Override
    public String apply(ProxiedPlayer player) {
        BungeePerms bp = BungeePerms.getInstance();
        PermissionsManager pm = bp.getPermissionsManager();
        if (pm != null) {
            User user = pm.getUser(player.getName());
            Group mainGroup = null;
            if (user != null) {
                mainGroup = pm.getMainGroup(user);
            }
            if (mainGroup == null) {
                if (!pm.getDefaultGroups().isEmpty()) {
                    mainGroup = pm.getDefaultGroups().get(0);
                    for (int i = 1; i < pm.getDefaultGroups().size(); ++i) {
                        if (pm.getDefaultGroups().get(i).getWeight() < mainGroup.getWeight()) {
                            mainGroup = pm.getDefaultGroups().get(i);
                        }
                    }
                }
            }
            if (mainGroup != null) {
                return mainGroup.getName();
            }
        }
        return null;
    }
}
