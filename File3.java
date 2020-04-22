StringBuilder query = new StringBuilder();
query.append( "select * from user u where u.name in (" + namesString + ")" );
try {
	Connection connection = getConnection();
    PreparedStatement statement = connection.prepareStatement(query.toString());
    resultSet = statement.executeQuery();
}