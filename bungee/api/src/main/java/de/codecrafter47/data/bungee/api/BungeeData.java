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

package de.codecrafter47.data.bungee.api;

import de.codecrafter47.data.api.DataKey;
import de.codecrafter47.data.api.DataKeyCatalogue;
import de.codecrafter47.data.api.Scope;
import de.codecrafter47.data.api.TypeToken;

import java.time.Duration;

public class BungeeData implements DataKeyCatalogue {
    public final static Scope SCOPE_BUNGEE_PLAYER = new Scope("bungee:player");

    // BungeeCord player data keys
    public final static DataKey<String> BungeeCord_DisplayName = new DataKey<>("bungeecord:displayname", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<String> BungeeCord_PrimaryGroup = new DataKey<>("bungeecord:group", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<Integer> BungeeCord_Ping = new DataKey<>("bungeecord:ping", SCOPE_BUNGEE_PLAYER, TypeToken.INTEGER);
    public final static DataKey<Integer> BungeeCord_Rank = new DataKey<>("bungeecord:rank", SCOPE_BUNGEE_PLAYER, TypeToken.INTEGER);
    public final static DataKey<String> BungeePerms_PrimaryGroup = new DataKey<>("bungeeperms:group", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<String> BungeePerms_Prefix = new DataKey<>("bungeeperms:prefix", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<String> BungeePerms_DisplayPrefix = new DataKey<>("bungeeperms:displayprefix", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<String> BungeePerms_Suffix = new DataKey<>("bungeeperms:suffix", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<Integer> BungeePerms_Rank = new DataKey<>("bungeeperms:rank", SCOPE_BUNGEE_PLAYER, TypeToken.INTEGER);
    public final static DataKey<String> BungeePerms_PrimaryGroupPrefix = new DataKey<>("bungeeperms:primarygroupprefix", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<String> BungeePerms_PlayerPrefix = new DataKey<>("bungeeperms:playerprefix", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<Duration> BungeeOnlineTime_OnlineTime = new DataKey<>("bungeeonlinetime:onlinetime", SCOPE_BUNGEE_PLAYER, TypeToken.DURATION);
    public final static DataKey<String> ClientVersion = new DataKey<>("minecraft:clientversion", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
    public final static DataKey<Duration> BungeeCord_SessionDuration = new DataKey<>("minecraft:sessionduration", SCOPE_BUNGEE_PLAYER, TypeToken.DURATION);
    public final static DataKey<String> BungeeCord_Server = new DataKey<>("bungeecord:server", SCOPE_BUNGEE_PLAYER, TypeToken.STRING);
}