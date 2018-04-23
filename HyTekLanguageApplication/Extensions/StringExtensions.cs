using System;
using System.Collections.Generic;
using System.Linq;
using HyTekLanguageApplication.Constants;

namespace HyTekLanguageApplication.Extensions
{
    public static class StringExtensions
    {
        private static readonly Dictionary<string, HashSet<string>> EventLookup = new Dictionary<string, HashSet<string>>
        {
            { "100M", new HashSet<string> { "100MeterDash" } },
            { "200M", new HashSet<string> { "200MeterDash" } },
            { "400M", new HashSet<string> { "400MeterDash", "400MeterDashTimedFinal" } },
            { "800M", new HashSet<string> { "800MeterRun" } },
            { "1600M", new HashSet<string> { "1600MeterRun" } },
            { "3200M", new HashSet<string> { "3200MeterRun" } },
            { "100M Hurdles", new HashSet<string> { "100MeterHurdles33\"", "100MeterHurdles" } },
            { "110M Hurdles", new HashSet<string> { "110MeterHurdles39\"", "110MeterHurdles" } },
            { "300M Hurdles", new HashSet<string> { "300MeterHurdles30\"", "300MeterHurdles36\"", "300MeterHurdles", "300MeterHurdlesTimedFinal" } },
            { "4x100M Relay", new HashSet<string> { "4x100MeterRelay" } },
            { "4x200M Relay", new HashSet<string> { "4x200MeterRelay" } },
            { "4x400M Relay", new HashSet<string> { "4x400MeterRelay" } },
            { "4x800M Relay", new HashSet<string> { "4x800MeterRelay" } },
            { "Shot Put", new HashSet<string> { "ShotPut" } },
            { "Discus", new HashSet<string> { "DiscusThrow" } },
            { "High Jump", new HashSet<string> { "HighJump" } },
            { "Long Jump", new HashSet<string> { "LongJump" } },
            { "Pole Vault", new HashSet<string> { "PoleVault" } },
            { "SKIP", new HashSet<string> { "102MeterDashWheelchair", "402MeterDashWheelchair"}}
        };

        private static readonly Dictionary<Gender, HashSet<string>> GenderLookup = new Dictionary<Gender, HashSet<string>>
        {
            { Gender.Male, new HashSet<string> { "Boys" } },
            { Gender.Female, new HashSet<string> { "Girls" } },
        };

        public static string GetFirstName(this string fullName)
        {
            if (fullName.Contains(","))
            {
                var commaSplit = fullName.Split(new[] { "," }, StringSplitOptions.RemoveEmptyEntries);
                return commaSplit[commaSplit.Length - 1];
            }

            var spaceSplit = fullName.Split(new[] { " " }, StringSplitOptions.RemoveEmptyEntries);
            return spaceSplit[0];
        }

        public static string GetLastName(this string fullName)
        {
            if (fullName.Contains(","))
            {
                var commaSplit = fullName.Split(new[] { "," }, StringSplitOptions.RemoveEmptyEntries).ToList();
                commaSplit.RemoveAt(commaSplit.Count - 1);
                return string.Join(" ", commaSplit);
            }

            var spaceSplit = fullName.Split(new[] { " " }, StringSplitOptions.RemoveEmptyEntries).ToList();
            spaceSplit.RemoveAt(0);
            return string.Join(" ", spaceSplit);
        }

        public static string TranslateSchool(this string schoolName, Dictionary<string, HashSet<string>> schoolLookup)
        {
            foreach (var kvp in schoolLookup)
            {
                if (kvp.Value.Contains(schoolName))
                {
                    return kvp.Key;
                }
            }

            throw new Exception($"School `{schoolName}` not found. Failing!");
        }

        public static string TranslateEventName(this string eventName)
        {
            foreach (var kvp in EventLookup)
            {
                if (kvp.Value.Contains(eventName))
                {
                    return kvp.Key;
                }
            }

            throw new Exception($"Event `{eventName}` not found. Failing!");
        }

        public static Gender TranslateGender(this string genderName)
        {
            foreach (var kvp in GenderLookup)
            {
                if (kvp.Value.Contains(genderName))
                {
                    return kvp.Key;
                }
            }

            throw new Exception($"Gender `{genderName}` not found! Failing!");
        }
    }
}